package com.ddns.namesorter.service;

import com.ddns.namesorter.model.PersonName;

import java.util.List;

public interface NameSorterService {
    List<PersonName> sortNames(List<PersonName> names);
}