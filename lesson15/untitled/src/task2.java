class Employee {
    public void getStatus() {
        System.out.println("Waiting for assignment by employees");}}
class Developer extends Employee {
    public void getStatus() {
        System.out.println("Working");}}

class SeniorDeveloper extends Employee {
    public void getStatus() {
        System.out.println("Working");}}
class Tester extends Employee {
    public void getStatus() {
        System.out.println("Working");}}
