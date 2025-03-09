public class MissionMan {
    int progress;  

    void StepLeft() {
        if (progress != 0) {
            progress -= 1;
        }
    }

    void StepRight() {
        if (progress != 4) {
            progress += 1;
        }
    }
}
