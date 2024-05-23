package com.subkore.back.menu.dto;

import lombok.Builder;

/**
 * @param id 메뉴의 DB상 일련번호
 * @param order 메뉴의 순서
 * @param icon 메뉴의 아이콘
 * @param text 메뉴의 이름
 * @param linkTo 메뉴가 어디로 가는지
 * @see com.subkore.back.menu.entity.Menu
 */
@Builder
public record MenuResponseDto(
    Long id,
    Integer order,
    String icon,
    String text,
    String linkTo
) {

}
