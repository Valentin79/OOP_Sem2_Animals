package Animals;

public abstract class Animal {
    private String nickname;

    public Animal(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname(){
        return nickname;
    }

    @Override
    public String toString(){
//        return this.getClass().getName() + " " + nickname;
        return nickname;
    }


}
