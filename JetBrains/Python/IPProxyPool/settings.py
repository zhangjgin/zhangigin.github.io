MAX_SCORE = 50

import logging

LOG_LEVEL = logging.DEBUG
LOG_FMT = '%(asctime)s %(filename)s [line:%(lineno)s: %(message)s]'
LOG_DATEFMT = '%Y-%m-%d %H:%M:%S'
LOG_FILENAME = 'log.log'

TEST_TIMEOUT = 10


MONGO_URL = 'mongo:http://127.0.0.1:27017/'