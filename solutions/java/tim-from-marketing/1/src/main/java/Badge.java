class Badge {
    public String print(Integer id, String name, String department) {
        // Handle null department by defaulting to "OWNER"
        String dept = (department == null) ? "OWNER" : department.toUpperCase();
        
        // Handle null ID by omitting the [ID] prefix
        if (id == null) {
            return String.format("%s - %s", name, dept);
        } else {
            return String.format("[%d] - %s - %s", id, name, dept);
        }
    }
}
