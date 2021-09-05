package one.digitalinnovation.personapi.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MessageResponseDTO {

    private String message;

    
	public MessageResponseDTO() {
		super();
	}

	public MessageResponseDTO(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public MessageResponseDTO setMessage(String message) {
		this.message = message;
		return this;
	}
    
    
}
