package com.checkmarx.cxconsole.clients.osa.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by: Dorg.
 * Date: 06/10/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)

public class OSAScanStatus {

    private OSAScanStatusEnum status;
    private String message;
    private String link;

    public OSAScanStatusEnum getStatus() {
        return status;
    }

    public void setStatus(OSAScanStatusEnum status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }


}
