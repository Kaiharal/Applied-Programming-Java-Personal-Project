public class Path {
    String[] slots = {"-", "-", "-", "-", "-"};  /
    MissionMan missionMan = new MissionMan();
    
    public Path() {
        missionMan.progress = 0;  
    }

    void DisplayMan() {
        
        for (int i = 0; i < slots.length; i++) {
            slots[i] = "-";
        }
        slots[missionMan.progress] = "O";  

     
        System.out.println(String.join(" ", slots));
    }

    boolean isWinner() {
        return missionMan.progress == 4; 
    }
}
