# Voice Assistant (named JARVIS 😜) Using Java
<br/>

## Introduction (❁´◡`❁):

This project is basically made by me in order to step in the world of Voice Assistant with Java. I have used two main components, or you can say Libraries for it. The first one is **FreeTTS**, this is for converting text-to-speech and the second one is **Sphinx4**, used for converting speech-to-text.<br/>

Using FreeTTS is somewhat easy, you just need to set the voice ***(this library comes with some inbuilt voices, you can use one of them or use another famous library specifically for choosing voices of your own choice, i.e. MBROLA)*** and that's it. Now give some command for it to speak and there you go... 😍. Need help? Just once check the sample [TTS.java](https://github.com/priyanshu-baran/Voice_Assistant_Using_Java/blob/master/src/TTS.java) file for this.<br/>

But when it comes to speech-to-text, you need to prepare some stuffs beforehand ***(as discussed in the installation section)***. For sample once have a look at [STT.java](https://github.com/priyanshu-baran/Voice_Assistant_Using_Java/blob/master/src/STT.java) file.

---
## ✅ Steps to start with:

1. Firstly clone this project and open it in any of your favourite IDE (mine is IntellIJ 😊).
2. Add all the jar files (basically the dependencies of this project) present in the library folder into your project folder from the IDE itself.
3. Now create a command.txt file and add all the commands which you want Jarvis to listen and respond accordingly.<br/>
> ***Remember:*** In this file, whatever commands you enter, only those words will be recognized, regardless of what you speak.
4. Now go to [this site](http://www.speech.cs.cmu.edu/tools/lmtool-new.html). And upload the command.txt file on the space given in it and then click `Compile Knowledge Base` button.
5. You will get redirected to next page from where you need to download two files, one is of .dic extension (called dictionary file) and other is .lm (called language model file) and save it in your project folder.
> ***Note:*** You can use mine too. As I already did all the steps required for some commonly used commands.
6. In order to confirm that your whole setup is working fine or not, run that two sample files [TTS.java](https://github.com/priyanshu-baran/Voice_Assistant_Using_Java/blob/master/src/TTS.java) and [STT.java](https://github.com/priyanshu-baran/Voice_Assistant_Using_Java/blob/master/src/STT.java). If they both runs smoothly then you are ready to move on to the next step 🥳🎉 else re-config your setup and try again 🤕🫣.
> Make sure to enable the mic permissions for your IDE (I did not do this and have changed almost half of my code 😅. So make sure you don't do this mistake).
7. And that's it. Now you can run the VoiceAssistant.java file and there you have it, your own personal voice assistant named **JARVIS** 🎙️ for your own convenience, and now you are ready to jump into action.

[//]: # (> ***Not Recommended:*** You can also use the .dic and .lm file which is already there in the sphinx library folder &#40;in case you need it 'Path name'&#41;.)

[//]: # ()
[//]: # (---)

[//]: # (## How to tweak this project for your own uses)

[//]: # ()
[//]: # (Since this is an example project, I'd encourage you to clone and rename this project to use your own purposes. It's a good starter boilerplate.)

[//]: # ()
[//]: # (---)

[//]: # (## Find a bug?)

[//]: # ()
[//]: # (If you found an issue or would like to submit an improvement to this project, please submit an issue using the issues tab above. If you would like to submit a PR with a fix, reference the issue you created.!)

---
## Known issues (Work in progress... 👷🏽‍♂️⚒️)

This project is still ongoing. I am working on converting this whole thing in a GUI for better user experience. So till then do whatever you like and wait for it as it will be soon get uploaded here.

---
## Like this project? 🤩

If you are feeling generous, buy me a coffee...!!! ☕<br/>

<a href="https://www.buymeacoffee.com/priyanshubaran" target="_blank"><img src="https://cdn.buymeacoffee.com/buttons/default-orange.png" alt="Buy Me A Coffee" height="41" width="174"></a>

---
### Happy Coding...!! 👨🏽‍💻👨🏽‍💻