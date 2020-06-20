from settings import MAX_SCORE


class Proxy(object):
    def __init__(self,ip,port,protocol=-1,nike_type=-1,speed=-1,area=None,score=MAX_SCORE,disable_domains=[]):
        self.ip = ip
        self.port = port
        self.protocol = protocol
        self.nike_type = nike_type
        self.speed = speed
        self.area = area
        self.score = score
        self.disable_domains = disable_domains

    def __str__(self):
        return str(self.__dict__)




