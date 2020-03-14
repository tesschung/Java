public class Pokemon {
    public final String name;
    public final int cp;

    // 객체 생성
    public Pokemon(String name, int cp) {
        this.name = name;
        this.cp = cp;
    }

    @Override
    public String toString() {
        // 객체를 문자열 형태로 바꿔서 String형태로 반환
        return name + "(" + cp + ")";
    }
}