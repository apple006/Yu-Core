package com.IceCreamQAQ.YuQ.event.events;

import lombok.Data;

@Data
public class FriendRequestEvent extends Event {

    private Integer time;
    private Long qq;
    private String msg;

    private Boolean accept;

}
