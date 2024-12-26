package com.sky.service;

import com.sky.entity.AddressBook;

import java.util.List;

/**
 * ClassName: AddressBookService
 * Package: com.sky.service
 * Description: This is a program for testing.
 *
 * @Author Ben
 * @Create 2024/12/26 10:01
 * @Version 1.0
 */
public interface AddressBookService {

    /**
     * 条件查询
     * @param addressBook
     * @return
     */
    List<AddressBook> list(AddressBook addressBook);

    void save(AddressBook addressBook);

    AddressBook getById(Long id);

    void setDefault(AddressBook addressBook);

    void deleteById(Long id);
}
