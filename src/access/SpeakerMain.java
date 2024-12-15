package access;

public class SpeakerMain {

    /* 접근 제어자의 종류
    1. private: 모든 외부 호출을 막는다.
    2. default(package-private): 같은 패키지안에서 호출은 허용한다.
    3. protected: 같은 패키지 안에서 호출은 허용한다. 패키지가 달라도 상속 관계의 호출은 허용한다.
    4. public: 모든 외부 호출을 허용한다.
    */

    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        // 필드에 직접 접근
        System.out.println("volume 필드 직접 접근 수정");
        // speaker.volume = 200;
        speaker.showVolume();
    }
}
