package decorators;

class Bird {
    public int age;

    public String fly() {
        return age < 10 ? "flying" : "too old";
    }
}

class Lizard {
    public int age;

    public String crawl() {
        return (age > 1) ? "crawling" : "too young";
    }
}

class Dragon {
    private Bird bird = new Bird();
    private Lizard lizard = new Lizard();
    private int age;

    public void setAge(final int age) {
        this.age = age;
        bird.age = age;
        lizard.age = age;
    }

    public String fly() {
        return bird.fly();
    }

    public String crawl() {
        return lizard.crawl();
    }

    public String breatheFire() {
        return (age > 5) ? "flame" : "spark";
    }
}