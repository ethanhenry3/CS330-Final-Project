# CS330-Final-Project
## Project Details
The purpose of this assignment was to implement Finite Automata concepts in solving real-life problems. Assigned to me in my Distrete Structures class by Professor Bistriceanu, students were tasked with developing a sort of security installation very similar to those installed in many offices and homes. The installation has a key pad, labeled from 0-9, determining whether or not a specific user has entered the correct access code. The security engine will unlock the lock when it finds the correct un-locking access code in the input string. Likewise, the security engine will lock the lock when it finds the correct locking access code in the input string. The program reads from standard input without echoing the input characters whilst other character aside from 0-9 are discarded quietly. The access code that will be recognized is the least significant five digits from my student ID (95238), followed by a 1 for the unlock code and by a 4 for the locking code. As soon as the last digit of the access code is enterd, the program will signal the action taken being either being lock or unlock.

## Build and Run the Executable
The language I used to build the executable was Java as it is what I am most proficient in. The code is very simplistic and easy to Build and Run.
The Java code that you recieved should already be in JAR File Format; therefore you do not need to worry about that. The test environments mentioned were with Windows 11, so I will explain how to run the executable under those circumstances.  

#### Step 1: Determine if Java is installed on your PC
To do that, first, launch the Run box by pressing Windows+R. Then, type the following in the box and press Enter: 
- `cmd`

In the Command Prompt window that opens, type the following command and press Enter:
- `java -version`

If you have java move on to the next step, if not please download java for free on the internet.

#### Step 2: Run JAR Files on Windows 11
To do this, first, open a File Explorer window and locate your JAR file. Then Right-click your JAR file and choose Open With > Java(TM) Platform SE Binary. Your JAR file will launch and you’ll be able to interact with it. And that’s all there is to it.

## Platform Its Been Tested On
The only platform I have tested on is my Mac device as I do not have windows or linux aviable. At the moment I have a jar file that provides a working GUI on my device along with raw code being submitted in my repository.

## Test Environments
1. A fresh installation of Ubuntu 22.04 LTS (Jammy Jellyfish)
2. A fresh installation of Windows 11

## Contact 
Ethan Henry - Twitter: @Ethan_Henry3 - Email: ehenry2@hawk.iit.edu



