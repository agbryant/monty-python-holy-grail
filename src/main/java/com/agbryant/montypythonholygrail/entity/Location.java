package com.agbryant.montypythonholygrail.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Data
@Builder
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class Location {


	@NonNull
	private String name;
	private String description;
	private Location next;
	private boolean finalLocation;
}
