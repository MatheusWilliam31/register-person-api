package br.com.loose_m.personapi.entity;

import br.com.loose_m.personapi.enums.EnumPhoneType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Phone {
	
	private Long id;
	
	private EnumPhoneType type;
	
	private String number;
}
