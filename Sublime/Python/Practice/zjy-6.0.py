import requests #line:1
import re #line:2
import json #line:3
import random #line:4
import time #line:5
import getpass #line:6
from PIL import Image #line:7
from io import BytesIO #line:8
wechat ="https://open.weixin.qq.com"#line:11
uuid_src_url =wechat +"/connect/qrconnect?appid=wx9666d18d257a0ac2&scope=snsapi_login&redirect_uri=https%3A%2F%2Fwww.icve.com.cn%2FcommonUser%2Fportal%2Fwechatlogin.html%3FdataSource%3D2&login_type=jssdk"#line:12
qrcode_prefix =wechat +"/connect/qrcode/"#line:13
wechat_login_url =wechat +"/connect/l/qrconnect?uuid="#line:14
common_login_url ="https://zjyapp.icve.com.cn/newMobileAPI/MobileLogin/newLogin"#line:17
icve_login_url ="https://www.icve.com.cn/commonUser/portal/WaChatLogin/weiXinLogin"#line:18
identity_url ="https://zjy2.icve.com.cn/api/common/login/loginFromIdentity"#line:19
course_list_url ="https://zjy2.icve.com.cn/api/student/learning/getLearnningCourseList"#line:20
process_list_url ="https://zjy2.icve.com.cn/api/study/process/getProcessList"#line:21
topic_url ="https://zjy2.icve.com.cn/api/study/process/getTopicByModuleId"#line:22
cell_url ="https://zjy2.icve.com.cn/api/study/process/getCellByTopicId"#line:23
token_url ="https://zjy2.icve.com.cn/api/common/Directory/viewDirectory"#line:24
log_url ="https://zjy2.icve.com.cn/api/common/Directory/stuProcessCellLog"#line:25
change_course_url ="https://zjy2.icve.com.cn/api/common/Directory/changeStuStudyProcessCellData"#line:26
wechat_sess =requests .session ()#line:29
zjy_sess =requests .session ()#line:30
courses =[]#line:33
modules =[]#line:34
topics =[]#line:35
courseOpenId =''#line:37
openClassId =''#line:38
token =''#line:39
def common_login (OO00O0O0O00O0O00O ,OO000OO000OO00O0O ):#line:43
    O00OOO00O0000O000 ={"userName":OO00O0O0O00O0O00O ,"userPwd":OO000OO000OO00O0O }#line:47
    OOOO000OO0OOO0OOO =zjy_sess .post (common_login_url ,data =O00OOO00O0000O000 ).text #line:48
    OOOO000OO0OOO0OOO =json .loads (OOOO000OO0OOO0OOO )#line:49
    print_user_info (OOOO000OO0OOO0OOO )#line:50
def wechat_login ():#line:54
    OO0OOOOO00000OOOO =wechat_sess .get (wechat_login_url ).text #line:55
    OOOO0O00O00OO0000 =OO0OOOOO00000OOOO [OO0OOOOO00000OOOO .index ('\'')+1 :-2 ]#line:56
    O00000O00OOOO0O0O =zjy_sess .post (icve_login_url ,data ={"code":OOOO0O00O00OO0000 }).text #line:57
    O00000O00OOOO0O0O =json .loads (O00000O00OOOO0O0O )#line:58
    print_user_info (O00000O00OOOO0O0O )#line:59
def get_uuid ():#line:63
    O0OO0O0O000000O00 =wechat_sess .get (uuid_src_url )#line:64
    OOOOO000OO00000O0 =re .compile (r"qrcode/.*\"")#line:65
    O0OOOOO0OO00OOOO0 =OOOOO000OO00000O0 .findall (O0OO0O0O000000O00 .text )#line:66
    return O0OOOOO0OO00OOOO0 [0 ].replace ("qrcode/","").replace ("\"","")#line:67
def show_qrcode_img (OO00OOO000OO000O0 ):#line:71
    OO00OOOO0O0O00000 =wechat_sess .get (OO00OOO000OO000O0 )#line:72
    OOOO0O0O000OOO000 =Image .open (BytesIO (OO00OOOO0O0O00000 .content ))#line:73
    OOOO0O0O000OOO000 .show ()#line:74
def print_user_info (OO0O0O0000O00OOO0 ):#line:78
    if OO0O0O0000O00OOO0 ['code']==1 :#line:79
        print ('[+] 登录成功')#line:80
        O0OOOO000OO0OOOOO =OO0O0O0000O00OOO0 ['userId']#line:81
        print ('[*] userId: '+O0OOOO000OO0OOOOO )#line:82
        OOOOOOOOO00OOO000 =zjy_sess .get (identity_url ).text #line:83
        OOOOOOOOO00OOO000 =json .loads (OOOOOOOOO00OOO000 )#line:84
        print ("[*] 学号: "+OOOOOOOOO00OOO000 ['userName'])#line:85
        print ("[*] 姓名: "+OOOOOOOOO00OOO000 ['displayName'])#line:86
        print ("[*] 学校: "+OOOOOOOOO00OOO000 ['schoolName'])#line:87
    else :#line:88
        print ('[-] '+OO0O0O0000O00OOO0 ['msg'])#line:89
def print_course_list ():#line:93
    global courses #line:94
    courses =zjy_sess .get (course_list_url ).text #line:95
    courses =json .loads (courses )#line:96
    for OOOOOO0O0OO0O0O0O in range (len (courses ['courseList'])):#line:99
        print ("\t"+str (OOOOOO0O0OO0O0O0O )+". "+courses ['courseList'][OOOOOO0O0OO0O0O0O ]['courseName'],end ="")#line:100
        print (" ["+courses ['courseList'][OOOOOO0O0OO0O0O0O ]['assistTeacherName']+"] "+str (courses ['courseList'][OOOOOO0O0OO0O0O0O ]['process'])+"%")#line:101
def print_process (O000OO0OOO00000OO ):#line:105
    global modules #line:106
    global courseOpenId #line:107
    global openClassId #line:108
    courseOpenId =courses ['courseList'][O000OO0OOO00000OO ]['courseOpenId']#line:110
    openClassId =courses ['courseList'][O000OO0OOO00000OO ]['openClassId']#line:111
    OO000000000O0OO0O =zjy_sess .post (process_list_url ,data ={"courseOpenId":courseOpenId ,"openClassId":openClassId }).text #line:112
    OO000000000O0OO0O =json .loads (OO000000000O0OO0O )#line:113
    modules =OO000000000O0OO0O ['progress']['moduleList']#line:114
    for O000OO0OOO00000OO in range (len (modules )):#line:115
        print ("\t"+str (O000OO0OOO00000OO )+". "+modules [O000OO0OOO00000OO ]['name']+" "+str (modules [O000OO0OOO00000OO ]['percent'])+"%")#line:116
def get_token (O00OOOOOO000OO0OO ,OO0O0OOOO00OOO0O0 ):#line:120
    global token #line:121
    OOO0O0OOOO0000O0O =modules [0 ]['id']#line:122
    O0OO0OOOOO0OO0OO0 ={"courseOpenId":courseOpenId ,"openClassId":openClassId ,"cellId":O00OOOOOO000OO0OO ,"flag":'s',"moduleId":OOO0O0OOOO0000O0O }#line:129
    O0OOOOO0OO0OO0O0O =zjy_sess .post (token_url ,data =O0OO0OOOOO0OO0OO0 ).text #line:130
    O0OOOOO0OO0OO0O0O =json .loads (O0OOOOO0OO0OO0O0O )#line:131
    if 'guIdToken'in O0OOOOO0OO0OO0O0O .keys ():#line:132
        token =O0OOOOO0OO0OO0O0O ['guIdToken']#line:133
        print ("[*] 获取Token成功")#line:134
    else :#line:135
        print ("[*] 尝试切换课程...")#line:136
        O0OO0OOOOO0OO0OO0 ={"courseOpenId":courseOpenId ,"openClassId":openClassId ,"cellId":O00OOOOOO000OO0OO ,"moduleId":OOO0O0OOOO0000O0O ,"cellName":OO0O0OOOO00OOO0O0 }#line:143
        O0OOOOO0OO0OO0O0O =zjy_sess .post (change_course_url ,data =O0OO0OOOOO0OO0OO0 ).text #line:144
        O0OOOOO0OO0OO0O0O =json .loads (O0OOOOO0OO0OO0O0O )#line:145
        if O0OOOOO0OO0OO0O0O ['code']==1 :#line:146
            print ("[*] 切换课程成功")#line:147
        get_token (O00OOOOOO000OO0OO ,OO0O0OOOO00OOO0O0 )#line:148
def fuck_topics ():#line:152
    for OOO0OOO000OO0OO00 in range (len (modules )):#line:153
        fuck_topic (OOO0OOO000OO0OO00 )#line:154
def fuck_topic (O0OOOO00OO0O00000 ):#line:158
    print ("[*] -> "+modules [O0OOOO00OO0O00000 ]['name'])#line:159
    if modules [O0OOOO00OO0O00000 ]['percent']!=100 :#line:160
        global topics #line:161
        O0O0OOO000OOO00O0 =modules [O0OOOO00OO0O00000 ]['id']#line:162
        topics =zjy_sess .post (topic_url ,data ={"courseOpenId":courseOpenId ,"moduleId":O0O0OOO000OOO00O0 }).text #line:163
        topics =json .loads (topics )#line:164
        topics =topics ['topicList']#line:165
        for O00O00000OOOOOO00 in topics :#line:167
            print ("[*] -->"+O00O00000OOOOOO00 ['name'])#line:168
            OO00OO0O0O0OO0OOO =O00O00000OOOOOO00 ['id']#line:169
            if OO00OO0O0O0OO0OOO !="0":#line:171
                O000OOO00O0O0O0OO =zjy_sess .post (cell_url ,data ={"courseOpenId":courseOpenId ,"openClassId":openClassId ,"topicId":OO00OO0O0O0OO0OOO }).text #line:173
                O000OOO00O0O0O0OO =json .loads (O000OOO00O0O0O0OO )#line:174
                O000OOO00O0O0O0OO =O000OOO00O0O0O0OO ['cellList']#line:175
                fuck_cell (O000OOO00O0O0O0OO )#line:176
            else :#line:177
                print ("[*] 跳过 "+O00O00000OOOOOO00 ['name']+" [原因: 空章节]")#line:178
    else :#line:179
        print ("[*] 跳过 "+modules [O0OOOO00OO0O00000 ]['name']+" [原因: 已完成]")#line:180
def fuck_cell (O000OOO0OO000OO0O ):#line:184
    for O00OOOO0OOOO00OO0 in O000OOO0OO000OO0O :#line:185
        if "childNodeList"in O00OOOO0OOOO00OO0 .keys ():#line:187
            fuck_cell (O00OOOO0OOOO00OO0 ['childNodeList'])#line:188
        if 'stuCellPercent'not in O00OOOO0OOOO00OO0 .keys ()or O00OOOO0OOOO00OO0 ['stuCellPercent']!=100 :#line:190
            get_token (O00OOOO0OOOO00OO0 ['Id'],O00OOOO0OOOO00OO0 ['cellName'])#line:191
            O0OOOOOO00OO0O000 ={"courseOpenId":courseOpenId ,"openClassId":openClassId ,"cellId":O00OOOO0OOOO00OO0 ['Id'],"cellLogId":"","picNum":300 ,"studyNewlyTime":str (random .randint (8000 ,12000 )),"studyNewlyPicNum":300 ,"token":token }#line:201
            O0OOOOO00OO00O0OO =log (log_url ,O0OOOOOO00OO0O000 )#line:202
            if O0OOOOO00OO00O0OO ['code']==1 :#line:203
                print ("[+] 成功: "+O00OOOO0OOOO00OO0 ['cellName'])#line:204
            else :#line:205
                print ("[*] 正在重试 "+O00OOOO0OOOO00OO0 ['cellName'])#line:207
                for O0O0O00000OO0OO00 in range (10 ):#line:208
                    O0OOOOO00OO00O0OO =log (log_url ,O0OOOOOO00OO0O000 )#line:209
                    if O0OOOOO00OO00O0OO ['code']==1 :#line:210
                        print ("[+] 成功: "+O00OOOO0OOOO00OO0 ['cellName'])#line:211
                        break #line:212
                    else :#line:213
                        if "msg"in O0OOOOO00OO00O0OO .keys ():#line:214
                            print ("[-] 失败: "+O0OOOOO00OO00O0OO ['msg'])#line:215
                            if "刷课记录"in O0OOOOO00OO00O0OO ['msg']:#line:216
                                print ("[!] 程序自动退出")#line:217
                                exit ()#line:218
        else :#line:219
            print ("[*] 跳过 "+O00OOOO0OOOO00OO0 ['cellName']+" [原因: 已完成]")#line:220
def log (OOOO0OO0O00OO0OOO ,O00000O00O00OOOOO ):#line:224
    O0OOOOOOOOO000OOO =random .randint (2 ,4 )#line:225
    print ("[*] 随机休眠 "+str (O0OOOOOOOOO000OOO )+" 秒")#line:226
    time .sleep (O0OOOOOOOOO000OOO )#line:227
    OO000OO0O0000000O =zjy_sess .post (OOOO0OO0O00OO0OOO ,data =O00000O00O00OOOOO ).text #line:228
    OO000OO0O0000000O =json .loads (OO000OO0O0000000O )#line:229
    return OO000OO0O0000000O #line:230
if __name__ =='__main__':#line:233
    print ("1. 账号密码登录")#line:234
    print ("2. 微信扫码登录")#line:235
    choice =input ("请选择登录方式: ")#line:236
    if choice =="1":#line:237
        username =input ("用户名: ")#line:239
        password =getpass .getpass ("密码(输入时不可见):")#line:240
        common_login (username ,password )#line:241
    else :#line:242
        uuid =get_uuid ()#line:244
        qrcode_url =qrcode_prefix +uuid #line:245
        wechat_login_url +=uuid #line:246
        show_qrcode_img (qrcode_url )#line:247
        input ("[*] 扫码后按任意键继续...")#line:248
        wechat_login ()#line:249
    while True :#line:252
        print_course_list ()#line:253
        choice =input ("选择课程序号: ")#line:254
        print_process (int (choice ))#line:255
        choice =input ("请选择章节序号(a=ALL): ")#line:256
        if choice =="a":#line:257
            fuck_topics ()#line:258
        else :#line:259
            fuck_topic (int (choice ))