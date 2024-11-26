package itstime.reflog.todolist.dto;

import jakarta.validation.constraints.AssertFalse;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class TodolistDTO {

	@Getter
	@NoArgsConstructor(access = AccessLevel.PRIVATE)
	public static class TodolistSaveOrUpdateRequest {

		@NotNull(message = "memberId는 null일 수 없습니다.")
		private Long memberId;

		@NotBlank(message = "content는 비어 있을 수 없습니다.")
		private String content;

		@NotNull(message = "status는 null일 수 없습니다.")
		@AssertFalse(message = "status는 초기 상태에서 false여야 합니다.")
		private boolean status;
	}

	@Getter
	@AllArgsConstructor
	public static class TodolistResponse {
		private final Long todolistId;
		private final String content;
		private final boolean status;
	}


}
