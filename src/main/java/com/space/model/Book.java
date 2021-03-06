package com.space.model;


import org.springframework.transaction.annotation.Transactional;
import javax.persistence.*;
import java.util.Date;

    @Entity
    @Transactional
//@Table(name = "book")
public class Book {

        @Id
// если имя переменной совпадает с полем annotation можно не писать
//    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        private String name;

        private String author;

        @Enumerated(EnumType.STRING)
        private BookType bookType;

        private Date prodDate;

        private Boolean isUsed;

        private  Integer bookcase;

        private Integer bookshelf;

        private Double rating;

        public long getId() {  return id; }

        public void setId(long id) { this.id = id; }

        public String getName() { return name; }

        public void setName(String name) { this.name = name; }
/*
        public String getPlanet() { return planet; }

        public void setPlanet(String planet) {
            this.planet = planet;
        }

        public ShipType getShipType() {
            return shipType;
        }

        public void setShipType(ShipType shipType) {
            this.shipType = shipType;
        }

 */

        public Date getProdDate() {
            return prodDate;
        }

        public void setProdDate(Date prodDate) {
            this.prodDate = prodDate;
        }

        public Boolean getUsed() {
            return isUsed;
        }

        public void setUsed(Boolean used) {
            isUsed = used;
        }
/*
        public Double getSpeed() {
            return speed;
        }

        public void setSpeed(Double speed) {
            this.speed = speed;
        }

        public Integer getCrewSize() {
            return crewSize;
        }

        public void setCrewSize(Integer crewSize) {
            this.crewSize = crewSize;
        }


 */
        public Double getRating() {
            return rating;
        }

        public void setRating(Double rating) {
            this.rating = rating;
        }
/*
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", bookType=" + bookType +
                ", prodDate=" + prodDate +
                ", isUsed=" + isUsed +
                ", bookcase=" + bookcase +
                ", bookshelf=" + bookshelf +
                ", rating=" + rating +
                '}';
    }

 */
}
