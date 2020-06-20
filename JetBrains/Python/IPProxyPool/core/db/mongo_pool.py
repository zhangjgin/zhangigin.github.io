from pymongo import MongoClient
from settings import MONGO_URL
from utils.log import logger
from domain import Proxy


class MongoPool(object):
    def __init__(self):
        self.client = MongoClient(MONGO_URL)

        self.proxies = self.client['proxies_pool']['proxies']

    def __del__(self):
        self.client.close()

    def insert_one(self, proxy):
        count = self.proxies.count_documents({'_id:proxy.ip'})
        if count == 0:
            dic = proxy.__dict__
            dic['_id'] = proxy.ip
            self.proxies.insert_one(dic)
            logger.info("插入新的代理:{}".format(proxy))
        else:
            logger.warning("已经存在的代理:{}".format(proxy));

    def update_one(self,proxy):
        self.proxies.update_one({'_id':proxy.ip},{'$set':proxy.__dict__})


if __name__ == '__main__':
    mongo = MongoPool()

    proxy = Proxy('202.104.113.35', port='53281')
    mongo.insert_one(proxy)

