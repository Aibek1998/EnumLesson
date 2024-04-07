public enum Area {
    CHUI ("Capital of Kyrgyzstan"),
    OSH("Delicious food"),
    JALALABAD("Recreation area - Arslanbab"),
    YSSYKKOL("lake - Yssyk-kol"),
    BATKEN("fruit Peach"),
    TALAS("vegetables - beans"),
    NARYN("mountains");
    String unusual ;

    Area(String unusual) {
        this.unusual=unusual;

    }

    public String getUnusual() {
        return unusual;
    }

    public void setUnusual(String unusual) {
        this.unusual = unusual;
    }

    @Override
    public String toString() {
        return "\n"+
                "unusual : " + unusual ;
    }
}
