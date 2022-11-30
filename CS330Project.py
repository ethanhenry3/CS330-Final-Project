#!/usr/bin/env python
# coding: utf-8

# In[14]:


import random
class SecurityDevice:
    def __init__(self) :
        self.unlock = 952384
        self.lock = 952381
    @staticmethod
    def main(self) :
        a = True
        c = 0
        key = SecurityDevice()
        while a :
            try :
                r =  random.randint(0,10000000000000)
                if (str(key.lock).lower() in str(r).lower()):
                    print("Locked")
                    print(r)
                    break
                if (str(key.unlock).lower() in str(r).lower()):
                    print("Unlocked")
                    print(r)
                    break
                c += 1
            except java.lang.Exception as e :
                print("Never Found")
            
        print("It takes " + str(c) + " seconds to crack the pin")
l = SecurityDevice()
print(l.main("s"))

