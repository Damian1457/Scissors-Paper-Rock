package com.project.collections.companys;

import java.util.ArrayList;
import java.util.List;

public class Companys {
    public static void main(String[] args) {
        List<String> companies = new ArrayList<>();
        companies.add("DELL");
        companies.add("APPLE");
        companies.add("SAMSUNG");
        companies.add("SONY");
        companies.add("ALCATEL");

        for (int i=0; i < companies.size(); i++) {
            StringBuilder company = new StringBuilder(companies.get(i));
            if (i < companies.size() -1) {
                company.append(", ");
            }
            System.out.print(company);
        }
    }
}
