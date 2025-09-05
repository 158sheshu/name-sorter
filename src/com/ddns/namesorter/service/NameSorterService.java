package com.ddns.namesorter.service;

import com.ddns.namesorter.model.PersonName;

import java.util.List;

/**
 * Service interface for sorting names.
 */
public interface NameSorterService {

    /**
     * Sorts a list of PersonName objects first by last name, then by given names.
     *
     * @param names List of PersonName objects to be sorted.
     * @return A new list of PersonName objects sorted by last name and given names.
     */
    List<PersonName> sortNames(List<PersonName> names);

}