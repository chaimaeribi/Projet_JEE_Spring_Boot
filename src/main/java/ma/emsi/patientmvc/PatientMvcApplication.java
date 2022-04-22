package ma.emsi.patientmvc;

import ma.emsi.patientmvc.entities.Patient;
import ma.emsi.patientmvc.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;


@SpringBootApplication
public class PatientMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientMvcApplication.class, args);
    }
    //@Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args -> {
            patientRepository.save(
                    new Patient(null,"chaimae",new Date(),false,123));
            patientRepository.save(
                    new Patient(null,"Yasmin",new Date(),false,349));
            patientRepository.save(
                    new Patient(null,"ghita",new Date(),false,581));
            patientRepository.save(
                    new Patient(null,"salma",new Date(),false,792));

            patientRepository.findAll().forEach(p ->{
                System.out.println(p.getNom());
            });
        };
    }

}
