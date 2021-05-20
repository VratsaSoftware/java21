package movie;

public enum Genre {
    CARTOON(2),
    THRILLER(16),
    HORROR(18),
    COMEDY(10),
    ACTION(16),
    ROMANTIC(14);

    private int minAge;

    Genre(int minAge) {
        this.minAge = minAge;
    }
}
