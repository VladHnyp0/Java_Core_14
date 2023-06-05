class Obbj implements Comparable<Obbj> {
    private String name;
    private int value;

    public Obbj(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int compareTo(Obbj other) {
        // Сортування за значенням поля value
        return Integer.compare(this.value, other.value);
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}