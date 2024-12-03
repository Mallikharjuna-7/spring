package com.xworkz.component.runner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.component.dto.BuildingDto;
import com.xworkz.component.dto.ChairsDto;
import com.xworkz.component.dto.ComputerDto;
import com.xworkz.component.dto.CupDto;
import com.xworkz.component.dto.PaperDto;
import com.xworkz.component.dto.PlansDto;
import com.xworkz.component.dto.PowerBankDto;
import com.xworkz.component.dto.RoadDto;

public class Runner {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComputerDto.class);

		Object computer = context.getBean(ComputerDto.class);
		System.out.println(computer);

		Object road = context.getBean(RoadDto.class);
		System.out.println(road);

		Object powerbank = context.getBean(PowerBankDto.class);
		System.out.println(powerbank);

		Object building = context.getBean(BuildingDto.class);
		System.out.println(building);

		Object paper = context.getBean(PaperDto.class);
		System.out.println(paper);

		Object chair = context.getBean(ChairsDto.class);
		System.out.println(chair);

		Object plan = context.getBean(PlansDto.class);
		System.out.println(plan);

		Object cup = context.getBean(CupDto.class);
		System.out.println(cup);

	}

}
