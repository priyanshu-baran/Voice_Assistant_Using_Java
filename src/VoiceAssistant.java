import com.sun.speech.freetts.*;
import edu.cmu.sphinx.api.*;

//import javax.script.*;
import java.awt.*;
import java.awt.event.*;
//import java.io.FileReader;
import java.util.concurrent.*;

public class VoiceAssistant{
    LiveSpeechRecognizer speech;
//    ScriptEngine se=new ScriptEngineManager().getEngineByName("Nashorn");
    SpeechResult speechResult,speechResult1,speechResult2,speechResult3,speechResult4;
    ProcessBuilder pb=new ProcessBuilder();
    String voiceCommand,voiceCommand1,voiceCommand2,voiceCommand3,voiceCommand4;
    @SuppressWarnings("BusyWait")
    VoiceAssistant() /*throws FileNotFoundException, ScriptException */{
//        se.eval(new FileReader("src\\Animation.js"));
        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
        Runnable task = () -> {
            try{
                Robot robot=new Robot();
                robot.keyPress(KeyEvent.VK_SPACE);
                robot.keyRelease(KeyEvent.VK_SPACE);
            }catch(Exception e){
                e.printStackTrace();
            }
        };
        String str;
        System.setProperty("freetts.voices","com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        Voice voice= VoiceManager.getInstance().getVoice("kevin16");
        Configuration config = new Configuration();
        config.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
        config.setDictionaryPath("src\\DictionaryFile.dic");
        config.setLanguageModelPath("src\\LanguageFile.lm");
        if(voice!=null){
            voice.allocate();
        }
        try{
            assert voice!=null;
            speech = new LiveSpeechRecognizer(config);
            speech.startRecognition(true);
            while((speechResult=speech.getResult())!=null){
                voiceCommand = speechResult.getHypothesis();
                System.out.println("User: "+voiceCommand+"...!!!");
                if(voiceCommand.equalsIgnoreCase("Wake up Jarvis")){
                    Thread.sleep(200);
                    str="Waking up the System...";
                    voice.setRate(180);
                    System.out.println("Jarvis: " + str);
                    voice.speak(str);
                    new Start1();
                    Thread.sleep(14200);
                    str="But first confirm your Identity. Tell me the unique code.";
                    voice.setRate(180);
                    System.out.println("Jarvis: " + str);
                    voice.speak(str);
                    while((speechResult1=speech.getResult())!=null){
                        voiceCommand1 = speechResult1.getHypothesis();
                        System.out.println("User: " + voiceCommand1);
                        if(voiceCommand1.equalsIgnoreCase("Aankurit")){
                            Thread.sleep(1500);
                            new Start2();
                            Thread.sleep(5800);
                            str="Hello Sir. Welcome Back..!!";
                            voice.setRate(200);
                            voice.setPitch(100);
                            voice.setVolume(1);
                            System.out.println("Jarvis: " + str);
                            voice.speak(str);
                            while((speechResult2=speech.getResult())!=null){
                                voiceCommand2 = speechResult2.getHypothesis();
                                System.out.println("User: " + voiceCommand2);
                                if(voiceCommand2.equalsIgnoreCase("Hello Jarvis")){
                                    Thread.sleep(200);
                                    str="How are you Sir?";
                                    voice.setRate(180);
                                    System.out.println("Jarvis: " + str);
                                    voice.speak(str);
                                }else if(voiceCommand2.equalsIgnoreCase("I'm Fine. What about you")){
                                    Thread.sleep(200);
                                    str="I'm good Sir";
                                    voice.setRate(180);
                                    System.out.println("Jarvis: " + str);
                                    voice.speak(str);
                                    Thread.sleep(1000);
                                    str="Want me to play a song ?";
                                    voice.setRate(200);
                                    System.out.println("Jarvis: " + str);
                                    voice.speak(str);
                                    while((speechResult3=speech.getResult())!=null){
                                        voiceCommand3 = speechResult3.getHypothesis();
                                        System.out.println("User: " + voiceCommand3);
                                        if(voiceCommand3.equalsIgnoreCase("Sure Why not")){
                                            Thread.sleep(200);
                                            str="Alright then";
                                            voice.setRate(180);
                                            System.out.println("Jarvis: " + str);
                                            voice.speak(str);
                                            str="Playing your faevourite song";
                                            voice.setRate(220);
                                            System.out.println("Jarvis: " + str);
                                            voice.speak(str);
                                            pb.command("cmd.exe","/c","start spotify");
                                            pb.start();
                                            scheduler.schedule(task,6, TimeUnit.SECONDS);
                                            break;
                                        }else if(voiceCommand3.equalsIgnoreCase("No, not now Jarvis")){
                                            Thread.sleep(200);
                                            str="Alright Sir. Please let me know if you need any help";
                                            voice.setRate(200);
                                            System.out.println("Jarvis: " + str);
                                            voice.speak(str);
                                            while((speechResult4=speech.getResult())!=null){
                                                voiceCommand4 = speechResult4.getHypothesis();
                                                System.out.println("User: " + voiceCommand4);
                                                if(voiceCommand4.equalsIgnoreCase("Ok Jarvis")){
                                                    Thread.sleep(200);
                                                    str="Ok Sir";
                                                    voice.setRate(180);
                                                    System.out.println("Jarvis: " + str);
                                                    voice.speak(str);
                                                    break;
                                                }
                                            }
                                            break;
                                        }
                                    }
                                }else if(voiceCommand2.equalsIgnoreCase("Who Am I")){
                                    Thread.sleep(200);
                                    str="You are my Creator, Master Priyanshu Baran";
                                    voice.setRate(160);
                                    System.out.println("Jarvis: " + str);
                                    voice.speak(str);
                                }else if(voiceCommand2.equalsIgnoreCase("Tell me something about yourself")){
                                    Thread.sleep(200);
                                    str="I'm Jarvis";
                                    voice.setRate(160);
                                    System.out.println("Jarvis: " + str);
                                    voice.speak(str);
                                    Thread.sleep(800);
                                    new Start3();
                                    Thread.sleep(12800);
                                    str="A smart AI based Voice Assistant, designed for Personal use only";
                                    voice.setRate(160);
                                    System.out.println("Jarvis: " + str);
                                    voice.speak(str);
                                }else if(voiceCommand2.equalsIgnoreCase("Open Chrome")){
                                    Thread.sleep(200);
                                    str="Opening Google Chrome...";
                                    voice.setRate(160);
                                    System.out.println("Jarvis: " + str);
                                    voice.speak(str);
                                    pb.command("cmd.exe","/c","start chrome www.google.com");
                                    pb.start();
                                }else if(voiceCommand2.equalsIgnoreCase("Close it Jarvis")){
                                    Thread.sleep(200);
                                    str="Closing application...";
                                    voice.setRate(180);
                                    System.out.println("Jarvis: " + str);
                                    voice.speak(str);
                                    pb.command("cmd.exe","/c","TASKKILL /IM chrome.exe");
                                    pb.start();
                                    pb.command("cmd.exe","/c","TASKKILL /F /IM spotify.exe");
                                    pb.start();
                                }else if(voiceCommand2.equalsIgnoreCase("Open Whatsapp")){
                                    Thread.sleep(200);
                                    str="Opening Whatsapp...";
                                    voice.setRate(180);
                                    System.out.println("Jarvis: " + str);
                                    voice.speak(str);
                                    pb.command("cmd.exe","/c","start chrome https://web.whatsapp.com/");
                                    pb.start();
                                }else if(voiceCommand2.equalsIgnoreCase("Thanks Jarvis")){
                                    Thread.sleep(200);
                                    str="It's my pleasure, Sir...!!!";
                                    voice.setRate(180);
                                    System.out.println("Jarvis: " + str);
                                    voice.speak(str);
                                }else if(voiceCommand2.equalsIgnoreCase("Show me today's weather forecast")){
                                    Thread.sleep(200);
                                    str="";
                                    voice.setRate(160);
                                    System.out.println("Jarvis: " + str);
                                    voice.speak(str);
                                    pb.command("cmd.exe","/c","start chrome ");
                                    pb.start();
                                }else if(voiceCommand2.equalsIgnoreCase("Bye Jarvis")){
                                    Thread.sleep(200);
                                    str="Bye Sir";
                                    voice.setRate(180);
                                    System.out.println("Jarvis: " + str);
                                    voice.speak(str);
                                    str="Take Care...!!!";
                                    voice.setRate(240);
                                    System.out.println("Jarvis: " + str);
                                    voice.speak(str);
                                    System.exit(0);
                                }
                            }
                        }else{
                            str="Access Denied";
                            voice.setRate(180);
                            voice.speak(str);
                        }
                    }
                }
            }
        }catch(Exception e){e.printStackTrace();}
    }
    public static void main(String[] args) /*throws ScriptException, FileNotFoundException*/ {
        new VoiceAssistant();
    }
}