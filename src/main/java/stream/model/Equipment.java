package stream.domain;

public record Equipment(Integer id, String name, Double price, EquipmentTypeEnum type) {

    public Equipment(Integer id, String name, Double price) {
        this(id, name, price, EquipmentTypeEnum.GENERAL);
    }

    public Equipment(Integer id, String name, Double price, EquipmentTypeEnum type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
