package com.example.coursebookservice.others;


import com.example.coursebookservice.models.Booking;
import com.example.coursebookservice.models.Course;
import com.example.coursebookservice.models.Customer;
import com.example.coursebookservice.repositories.BookingRepository;
import com.example.coursebookservice.repositories.CourseRepository;
import com.example.coursebookservice.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
@Component //Comment this out if you do not to run the data loader.
public class DataLoader  implements ApplicationRunner {
    @Autowired
    BookingRepository bookingRepository;


    @Autowired
    CustomerRepository customerRepository;


    @Autowired
    CourseRepository courseRepository;

//   DataLoader.clearAll()

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {

        Course course1 = new Course("Python", "Glasgow", 4);
        courseRepository.save(course1);

        Course course2 = new Course("JavaScript", "Aberdeen", 3);
        courseRepository.save(course2);

        Course course3 = new Course("C#", "Dundee", 5);
        courseRepository.save(course3);

        Course course4 = new Course("Ruby", "Inverness", 2);
        courseRepository.save(course4);

        Course course5 = new Course("PHP", "Stirling", 3);
        courseRepository.save(course5);



        Customer customer1 = new Customer("John", "Edinburgh", 30);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Sarah", "Glasgow", 25);
        customerRepository.save(customer2);

        Customer customer3 = new Customer("Michael", "Aberdeen", 40);
        customerRepository.save(customer3);

        Customer customer4 = new Customer("Emily", "Inverness", 28);
        customerRepository.save(customer4);

        Customer customer5 = new Customer("David", "Dundee", 35);
        customerRepository.save(customer5);


        Booking booking1 = new Booking("12-09-23", course1, customer1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("13-09-23", course2, customer2);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking("14-09-23", course3, customer3);
        bookingRepository.save(booking3);

        Booking booking4 = new Booking("15-09-23", course4, customer4);
        bookingRepository.save(booking4);

        Booking booking5 = new Booking("16-09-23", course5, customer5);
        bookingRepository.save(booking5);

    }



}
