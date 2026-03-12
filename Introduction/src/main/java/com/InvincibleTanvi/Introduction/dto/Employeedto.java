package com.InvincibleTanvi.Introduction.dto;

import com.InvincibleTanvi.Introduction.entities.EmployeeEntity;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Employeedto implements List<EmployeeEntity> {
    private Long id;
    private String name;
    private String email;
    private Integer age;
    private LocalDate dateOfJoining;
    private boolean isActive;

    public Employeedto(Long employeeId, String tanvi, String s, int i, int i1, int i2, int i3, boolean b){
    //POJO class
    }

    public Employeedto(Long id, String name, String email, Integer age, LocalDate dateOfJoining, Boolean isActive){
        this.id=id;
        this.name=name;
        this.email=email;
        this.age=age;
        this.dateOfJoining=dateOfJoining;
        this.isActive=isActive;


    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<EmployeeEntity> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(EmployeeEntity employeeEntity) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends EmployeeEntity> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends EmployeeEntity> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public EmployeeEntity get(int index) {
        return null;
    }

    @Override
    public EmployeeEntity set(int index, EmployeeEntity element) {
        return null;
    }

    @Override
    public void add(int index, EmployeeEntity element) {

    }

    @Override
    public EmployeeEntity remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<EmployeeEntity> listIterator() {
        return null;
    }

    @Override
    public ListIterator<EmployeeEntity> listIterator(int index) {
        return null;
    }

    @Override
    public List<EmployeeEntity> subList(int fromIndex, int toIndex) {
        return List.of();
    }
}


