package org.example;

import org.example.Entity.ProgrammingLanguage;

import org.example.Entity.Technology;
import org.example.Repository.concrete.hibernate.HibernateProgrammingLanguageRepository;

import org.example.Repository.concrete.hibernate.HipernateTechnologyRepository;
import org.example.Service.abstracts.ProgrammingLanguageService;

import org.example.Service.abstracts.TechnologyService;
import org.example.Service.concrete.ProgrammingLanguageServiceImpl;
import org.example.Service.concrete.TechnologyServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ProgrammingLanguageService programmingLanguageService =
                new ProgrammingLanguageServiceImpl(new HibernateProgrammingLanguageRepository());

        TechnologyService technologyService = new TechnologyServiceImpl(new HipernateTechnologyRepository());




        System.out.println(" Programlama Dilleri Ekleniyor...");




        System.out.println(" Tüm Programlama Dilleri:");
        List<ProgrammingLanguage> programmingLanguages = programmingLanguageService.getProgrammingLanguages();
        for (var item : programmingLanguages) {
            System.out.println(item.getId() + " - " + item.getName());
        }


        System.out.println(" Java güncelleniyor...");
        programmingLanguageService.update(new ProgrammingLanguage(1, "Java SE"));


        System.out.println(" ID ile Programlama Dili Getirme (ID: 1)");
        ProgrammingLanguage lang = programmingLanguageService.getById(1);
        if (lang != null) {
            System.out.println("Bulundu: " + lang.getId() + " - " + lang.getName());
        } else {
            System.out.println("Dil bulunamadı!");
        }


        System.out.println(" JavaScript siliniyor...");
        programmingLanguageService.delete(3);


        System.out.println("Programing Language En Son Liste");
        List<ProgrammingLanguage> programmingLanguages1 = programmingLanguageService.getProgrammingLanguages();
        for (var item : programmingLanguages) {
            System.out.println(item.getId() + " - " + item.getName());
        }

        System.out.println("Technolgy Listesi Ekleniyor");
        List<Technology> technologies = technologyService.getTechnologies();
        for (var item : technologies) {
            System.out.println(item.getId() + " - " + item.getName() +" "+ "Program Dili"+" "+ item.getProgrammingLanguage().getName());


        }


















    }
}
