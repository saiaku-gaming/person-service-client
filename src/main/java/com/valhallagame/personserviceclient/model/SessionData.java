package com.valhallagame.personserviceclient.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SessionData {
	private String id;
	private PersonData person;
}
