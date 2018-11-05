package c05.loose;

public class Provider {

    public static String global = "disable";

    /**
     * 规模
     * 较少参数
     */
    String less(String one) {
        return "less";
    }

    /**
     * 规模
     * 较多参数
     */
    String more(String one, String two, String three) {
        return "one, two, three";
    }

    /**
     * 规模
     * 较少调用(连接)
     */
    String total(String one, String two) {
        return  part1(one) + part2(two);
    }

    /**
     * 规模
     * 较多调用(连接)
     */
    String part1(String one) {
        return "part1";
    }

    /**
     * 规模
     * 较多调用(连接)
     */
    String part2(String two) {
        return "part2";
    }

    /**
     * 可见性
     * 不可见
     */
    String disable() {
        return global;
    }

    /**
     * 可见性
     * 可见
     */
    String visible(String param) {
        return param;
    }

    /**
     * 灵活性
     * 聚合
     */
    String group(Person person) {
        return person.getName() + person.getAge();
    }

    /**
     * 灵活性
     * 分散
     */
    String dispersion(String name, Integer age) {
        return name + age;
    }

    /**
     * 如果参数过多影响可读性，则创建只包含必要字段的类可能会更好，过多的无用字段会影响可读性
     */
    String group(GroupParam groupParam) {
        return groupParam.getName() + groupParam.getAge();
    }

}
