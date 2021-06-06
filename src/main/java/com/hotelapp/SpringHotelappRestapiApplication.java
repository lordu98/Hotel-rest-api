package com.hotelapp;

import com.hotelapp.models.Address;
import com.hotelapp.models.Delivery;
import com.hotelapp.models.Hotel;
import com.hotelapp.models.Menu;
import com.hotelapp.service.DeliveryService;
import com.hotelapp.service.HotelService;
import com.hotelapp.service.MenuService;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class SpringHotelappRestapiApplication implements CommandLineRunner {

    public static void main(String[] args) throws UnirestException {
        SpringApplication.run(SpringHotelappRestapiApplication.class, args);
//        HttpResponse<String> response = Unirest.post("https://google-translate1.p.rapidapi.com/language/translate/v2")
//                .header("content-type", "application/x-www-form-urlencoded")
//                .header("accept-encoding", "application/gzip")
//                .header("x-rapidapi-key", "12ec57c52bmsh0f435322398bbbfp17542bjsn60166ecf766d")
//                .header("x-rapidapi-host", "google-translate1.p.rapidapi.com")
//                .body("q=salom&target=en&source=uz")
//                .asString();
//        System.out.println(response.getBody());
    }

    HotelService hotelService;
    DeliveryService deliveryService;
    MenuService menuService;

    @Autowired
    public SpringHotelappRestapiApplication(HotelService hotelService, DeliveryService deliveryService, MenuService menuService) {
        this.hotelService = hotelService;
        this.deliveryService = deliveryService;
        this.menuService = menuService;
    }

    //************************************************************************************************************

    @Override
    public void run(String... args) throws Exception {
//        Address address = new Address("JP nagar", "Bangalore", 567890, "Kar");
//
//        Menu menu1 = new Menu("Idli", 20);
//        Menu menu2 = new Menu("Dosa", 120);
//        Set<Menu> menuList = new HashSet<>(Arrays.asList(menu1, menu2));
//
////        Delivery del1 = new Delivery("swiggy", 120);
////        Delivery del2 = new Delivery("uber", 130);
//
//        Delivery del1 = deliveryService.getDeliveryByPartner("uber");
//
//        Set<Delivery> deliveryList = new HashSet<>(Arrays.asList(del1));
//
//        Hotel hotel = new Hotel("The Shanthos", address, menuList, deliveryList);
//
//        hotelService.addHotel(hotel);


        //***********************************************************************************
//        Hotel hotel = hotelService.getHotelById(202);
//        System.out.println(hotel);
//        hotel.getAddress().setCity("Karwar");
//        hotelService.updateHotel(hotel);
//        hotel=hotelService.getHotelById(202);
//        System.out.println(hotel);
//

        //***********************************************************************************
//        hotelService.getHotelsByCity("Bangalore")
//                .forEach(h -> System.out.println(h.getHotelName() + " " + h.getAddress().getCity()));
//        System.out.println();
//
//        hotelService.getHotelsByLocation("JP nagar")
//                .forEach(h -> System.out.println(h.getHotelName() + " " + h.getMenuList()));
//        System.out.println();


//       // ***********************************************************************************
//        hotelService.getHotelsByMenu("Idli")
//                .forEach(h -> System.out.println(h.getHotelName() + " " + h.getAddress().getStreetName()));
//        System.out.println();
//
//        hotelService.getHotelsByDelivery("swiggy")
//                .forEach(h -> System.out.println(h.getHotelName() + " " + h.getAddress().getStreetName()));
//        System.out.println();


        // ***********************************************************************************
//        hotelService.getHotelsByLocationAndMenu("JP nagar","Cakes")
//                .forEach(h-> System.out.println(h.getHotelName()+" "+h.getAddress().getCity()));

//        menuService.getMenusByHotel("A2B")
//                .forEach(m-> System.out.println(m.getMenuName()+" "+m.getPrice()));

//        System.out.println(hotelService.getHotelById(202));

    }
}
