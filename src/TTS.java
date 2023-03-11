import com.sun.speech.freetts.*;

class TTS{
    TTS(){
        System.setProperty("freetts.voices","com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        Voice voice=VoiceManager.getInstance().getVoice("kevin16");
        if(voice!=null){
            voice.allocate();
        }
        try{
            assert voice!=null;
            voice.setRate(180);
            voice.setPitch(100);
            voice.setVolume(1);
            voice.speak("Hello Sir");
            voice.setRate(160);
            voice.speak("What can I be of service");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        new TTS();
    }
}