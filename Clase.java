public class Clase {

    public List<T> search(String key, String method) {
        List<T> results = new SimpleList<>();
        Iterator<T> iterator = iterator();
        while (iterator.hasNext()) {
            T ob = iterator.next();
            try {
                Method getNameMethod = ob.getClass().getDeclaredMethod(method);
                String name = (String) getNameMethod.invoke(ob);
                if (name.contains(key)) {
                    results.add(ob);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return results;
    }

}
