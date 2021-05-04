package com.example.dbbrowser.controller;

import com.example.dbbrowser.dto.ConnectionProperties;
import com.example.dbbrowser.dto.Schema;
import java.util.List;
import java.util.Optional;

public interface BrowserApi {
    List<ConnectionProperties> listProperties();

    ConnectionProperties addProperties(ConnectionProperties properties);

    ConnectionProperties updateProperties(ConnectionProperties properties);

    void deleteProperties(Long id);

    public List<String> listSchemas();
}
