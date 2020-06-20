import time
import requests
import json

from utils.http import get_request_headers
from settings import TEST_TIMEOUT
from utils.log import logger
from domain import Proxy


def check_proxy(proxy):
    proxies = {
        'http' : 'http://{}:{}'.format(proxy.ip, proxy.port),
        'https' : 'https://{}:{}'.format(proxy.ip, proxy.port)

    }
    http, http_nick_type, http_speed = _check_http_proxies(proxies)
    https, https_nick_type, https_speed = _check_http_proxies(proxies, False)

    if http and https:
        proxy.protocol = 2
        proxy.nick_type = http_nick_type
        proxy.speed = http_speed
    elif http:
        proxy.protocol = 0
        proxy.nike_type = http_nick_type
        proxy.speed = http_speed
    elif https:
        proxy.protocol = 1
        proxy.nike_type = https_nick_type
        proxy.speed = https_speed
    else:
        proxy.protocol = -1
        proxy.nike_type =-1
        proxy.speed =-1
    return proxy


def _check_http_proxies(proxies, is_http=True):
    nick_type = -1
    speed = -1
    if is_http:
        test_url = 'http://httpbin.org/get'
    else:
        test_url = 'https://httpbin.org/get'
    try:
        start = time.time()

        response = requests.get(test_url, headers=get_request_headers(), proxies=proxies, timeout=TEST_TIMEOUT)

        if response.ok:
            speed = round(time.time() - start, 2)
            dic = json.loads(response.text)
            origin = dic['origin']
            proxy_connection = dic['headers'].get('Proxy-Connection', None)
            if ',' in origin:
                nick_type = 2
            elif proxy_connection:
                nick_type = 1
            else:
                nick_type = 0
            return True, nick_type, speed
        return False, nick_type, speed
    except Exception as ex:
        # logger.exception(ex)
        return False, nick_type, speed


if __name__ == '__main__':

    proxy = Proxy('81.95.131.10', port='44292')
    print(check_proxy(proxy))