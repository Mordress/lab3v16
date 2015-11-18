package com.gmail.mordress.lab3.models;

public class Voucher {

    private String id;

    private String country;

    private Type type;

    private Integer numberOfDays;

    private Integer numberOfNights;

    private Transport transport;

    private Integer cost;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Integer getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(Integer numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public Integer getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(Integer numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public class Hotel {

        private Integer stars;

        private Inclusive inclusive;

        private Boolean oneHumanRooms;

        private Boolean twoHumanRooms;

        private Boolean threeHumanRooms;

        private Food food;

        private Boolean tv;

        private Boolean wiFi;

        private Boolean conditioner;

        private Boolean refrigerator;

        public Integer getStars() {
            return stars;
        }

        public void setStars(Integer stars) {
            this.stars = stars;
        }

        public Inclusive getInclusive() {
            return inclusive;
        }

        public void setInclusive(Inclusive inclusive) {
            this.inclusive = inclusive;
        }

        public Boolean getOneHumanRooms() {
            return oneHumanRooms;
        }

        public void setOneHumanRooms(Boolean oneHumanRooms) {
            this.oneHumanRooms = oneHumanRooms;
        }

        public Boolean getTwoHumanRooms() {
            return twoHumanRooms;
        }

        public void setTwoHumanRooms(Boolean twoHumanRooms) {
            this.twoHumanRooms = twoHumanRooms;
        }

        public Boolean getThreeHumanRooms() {
            return threeHumanRooms;
        }

        public void setThreeHumanRooms(Boolean threeHumanRooms) {
            this.threeHumanRooms = threeHumanRooms;
        }

        public Food getFood() {
            return food;
        }

        public void setFood(Food food) {
            this.food = food;
        }

        public Boolean getTv() {
            return tv;
        }

        public void setTv(Boolean tv) {
            this.tv = tv;
        }

        public Boolean getWiFi() {
            return wiFi;
        }

        public void setWiFi(Boolean wiFi) {
            this.wiFi = wiFi;
        }

        public Boolean getConditioner() {
            return conditioner;
        }

        public void setConditioner(Boolean conditioner) {
            this.conditioner = conditioner;
        }

        public Boolean getRefrigerator() {
            return refrigerator;
        }

        public void setRefrigerator(Boolean refrigerator) {
            this.refrigerator = refrigerator;
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Количество звезд отеля: ").append(getStars() + "\n");
            stringBuilder.append("Вид \"все включено\": ").append(getInclusive() + "\n");
            stringBuilder.append("Наличие одноместных номеров: ").append(getOneHumanRooms() + "\n");
            stringBuilder.append("Наличие двухместных номеров: ").append(getTwoHumanRooms() + "\n");
            stringBuilder.append("Наличие трехместных номеров: ").append(getThreeHumanRooms() + "\n");
            stringBuilder.append("Еда: ").append(getFood() + "\n");
            stringBuilder.append("ТВ: ").append(getTv() + "\n");
            stringBuilder.append("Wi-Fi: ").append(getWiFi() + "\n");
            stringBuilder.append("Кондиционер: ").append(getConditioner() + "\n");
            stringBuilder.append("Холодильник: ").append(getRefrigerator() + "\n");
            return stringBuilder.toString();
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ID: ").append(getId() + "\n");
        stringBuilder.append("Тип поездки: ").append(getType() + "\n");
        stringBuilder.append("Страна: ").append(getCountry() + "\n");
        stringBuilder.append("Количество дней: ").append(getNumberOfDays() + "\n");
        stringBuilder.append("Количество ночей: ").append(getNumberOfNights() + "\n");
        stringBuilder.append("Стоимость: ").append(getCost() + "\n");
        return  stringBuilder.toString();
    }
}
