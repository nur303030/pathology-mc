package com.UNH.pathologyservicems;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/pathology")
public class PathologyResourse {
	
	

	List<Disease>disease=Arrays.asList(
	new Disease("D1","cold","warm woter"),
	new Disease("D2","heat","madicine"),
	new Disease("D3","flu","sleep"),
	new Disease("D4","bowl","drink green tea")
	);


	//get all the resources
	@RequestMapping("/diseases")
	public DiseasesList getDiseases(){
		DiseasesList diseasesList=new DiseasesList();
		diseasesList.setDiseases(disease);
		return diseasesList;
	}

	//get single resource
	@RequestMapping("/disease/{id}")
	public Disease getDiseaseById(@PathVariable("id")String Id) {
		Disease d=disease.stream().filter(disease -> Id.equals(disease.getId())).findAny().orElse(null);
		return d;
	}

}
