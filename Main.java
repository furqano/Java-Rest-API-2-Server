package org.example;




import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.counting;


public class Main {
    public static void main(String[] args) throws IOException {
        String REPORT_FILE_NAME = "/home/furqano/owasp-test.json";
        JsonMapper jsonMapper=new JsonMapper();
        ObjectMapper objectMapper = new ObjectMapper();
        File resultFile = new File(REPORT_FILE_NAME);
//        List<DependencyCheckCheckResult> dependencyCheckCheckResults = new ArrayList<>();
        DependencyCheckResults dependencyCheckResults = jsonMapper.readValue(resultFile, DependencyCheckResults.class);
//        System.out.println(dependencyCheckResults);
//        Map<String, List<String>>  map = new HashMap();
//
//        Map<String, List<DependencyCheckCheckResult>> studentsBySubject = dependencyCheckResults.getResults()
//                .stream()
//                .collect(
//                        Collectors.groupingBy(DependencyCheckCheckResult::getCve)
//                );
//        System.out.println(studentsBySubject);
//        dependencyCheckResults.getResults().forEach(
//                dependencyCheckCheckResult -> {
//                    List k = studentsBySubject.get(dependencyCheckCheckResult.getCve());
//                    k.forEach(a-> System.out.println(a));
//                }
//        );

//        Map<String, Set<String>> groupCveByDependencyName = dependencyCheckResults.getResults().stream().collect(
//                Collectors.groupingBy(DependencyCheckCheckResult::getDependencyName,
//                        Collectors.mapping(DependencyCheckCheckResult::getCve, Collectors.toSet())
//                )
//        );
//        System.out.println(groupCveByDependencyName);
//        maap = dependencyCheckResults.getResults().stream().collect(Collectors.groupingBy(
//                DependencyCheckCheckResult::getDependencyName,Collectors.mapping(DependencyCheckCheckResult::getCve,Collectors.toList())
//        ));
//        System.out.println(maap);
//        System.out.println(dependencyCheckResults.getResults().stream().map(DependencyCheckCheckResult::getDependencyName).count());
//
//        Map<String, Map<String, List<DependencyCheckCheckResult>>> groupCveByDependencyName = dependencyCheckResults.getResults().stream().collect(
//                Collectors.groupingBy(DependencyCheckCheckResult::getCve,
//                        Collectors.groupingBy(DependencyCheckCheckResult::getDependencyName))
////                        Collectors.mapping(DependencyCheckCheckResult::getCve, Collectors.toList())
//                );
//
//
////        dependencyCheckResults.getResults().stream();
//        System.out.println(groupCveByDependencyName);
//
//
//        System.out.println(groupByPriceMap.containsKey("lodash:4.17.15"));



        //        dependencyCheckResults.getResults().forEach(dependencyCheckCheckResult -> {
//
//            // create map if new value add .. if value existing just add cve and pass cve as item in assessment report
////            Map map = new HashMap();
//
//            if(map.containsKey(dependencyCheckCheckResult.getDependencyName())){
//                map.get(dependencyCheckCheckResult.getDependencyName()).add(dependencyCheckCheckResult.getCve());
//            }else {
//                map.put(dependencyCheckCheckResult.getDependencyName(), new LinkedList<String>());
//                map.get(dependencyCheckCheckResult.getDependencyName()).add(dependencyCheckCheckResult.getCve());
////                map.put(dependencyCheckCheckResult.getDependencyName(), Collections.singletonList(dependencyCheckCheckResult.getCve()));
//            }
//
//        });
            Set<String> seen = new HashSet<>();
            dependencyCheckResults.getResults().stream()
                    .filter(e -> seen.add(e.getDependencyName()))
                    .collect(Collectors.toSet());
            System.out.println(seen);
//
//        HashSet<Object> seen=new HashSet<>();
////
////            dependencyCheckResults.getResults().removeIf(e->!seen.add(e.getDependencyName()));
//
        Set<String> nameSet = new HashSet<>();
        List<DependencyCheckCheckResult> employeesDistinctByName = dependencyCheckResults.getResults().stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(employeesDistinctByName);
//
//        String cve = "CVE-2020-8203, CVE-2021-23337, NPM 1070117, NPM 1070247, CVE-2020-28500, NPM 1070122";
//        String[] Cve = cve.split(", ");
//        StringBuilder formattedCve = new StringBuilder();
//        formattedCve.append("<ul>");
//        for (String formattedve : Cve) {
//            formattedCve.append("<li><a href=https://cwe.mitre.org/data/definitions/").append(formattedve).append(" style=\"color:blue;\" target=\"_blank\">").append(formattedCve).append("</a></li>");
//        }
//        formattedCve.append("</ul>");
//  
//        System.out.println(formattedCve);
//        dependencyCheckResults.getResults().stream()
//                .collect(collectingAndThen(toCollection(() -> new TreeSet<>(comparingInt(Employee::getId))),
//                        ArrayList::new));
//
////try {
//    trivyCheckResultsList = Arrays.asList(jsonMapper.readValue(resultFile, TrivyCheckResults[].class));
//
////}catch (Exception e){
////    System.out.println("\"Error casting Json object to Json Array\"");
////}
//
//
//
////        TrivyResults[] results= objectMapper.readValue(resultFile, TrivyResults[].class);
//        for (TrivyCheckResults items: trivyCheckResultsList) {
//            System.out.println(items.getTarget());
//            items.getVulnerabilities().forEach(vulnerabilities -> {
//
//
//
//
//            });
//            }
//        }

//        System.out.println(trivyCheckResults);


    }}
