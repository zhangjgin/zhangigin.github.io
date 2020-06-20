import random
score = random.randint(0,100)
print(score)
# print(user_guess)
# print(type(user_guess))
while True:
    user_guess = int(input("请输入一个数字:\n"))
    if score == user_guess:
        print("你真是一个小天才,恭喜您就猜中了")
        break
    elif score > user_guess :
        print("大了")
    else:
        print("小了")


