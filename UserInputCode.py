#!/usr/bin/env python
# coding: utf-8

# In[16]:


class SecurityDevice:
    def __init__(self) :
        self.unlock = 952384
        self.lock = 952381
    @staticmethod
    def main(self) :
        l = []
        a = True
        key = SecurityDevice()
        inp = input('Enter the code to either unlock or lock the Security Device: ')
        while a :
            try:
                if (str(key.lock).lower() in str(inp).lower()):
                    l.append("952381")
                    
                if (str(key.unlock).lower() in str(inp).lower()):
                    l.append("952384")
                    
                    
                if (str(key.unlock).lower() in l[-1] or (str(key.lock).lower() in l[-1])):
                    print(l[-1])
                    if (("952384") in (l[-1])):
                        print("Unlock")
                    if (("952381") in (l[-1])):
                        print("Lock")
                    break
                    
            except:
                print("Not found")
                break
            
l = SecurityDevice()
print(l.main("s"))

