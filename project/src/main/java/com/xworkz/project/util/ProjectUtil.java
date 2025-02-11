package com.xworkz.project.util;

import org.springframework.beans.BeanUtils;

import com.xworkz.project.dto.ProjectDto;
import com.xworkz.project.entity.SignUpEntity;

public class ProjectUtil {

	private ProjectUtil() {

	}

	public static SignUpEntity convertDtoToEntity(ProjectDto dto) {
		SignUpEntity entity = new SignUpEntity();
		BeanUtils.copyProperties(dto, entity);
		return entity;
	}

	public static ProjectDto convertEntityToDto(SignUpEntity entity) {
		ProjectDto dto = new ProjectDto();
		BeanUtils.copyProperties(entity, dto);
		return dto;
	}

}
