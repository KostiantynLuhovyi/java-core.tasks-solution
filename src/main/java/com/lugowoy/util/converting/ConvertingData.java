package com.lugowoy.util.converting;

/**
 * Created by Konstantin on 29-Jan-17.
 *
 * @author Konstantin Lugowoy
 * @version 1.0
 * @since 1.1
 * <p>
 * Class is a kind of container for the implementation of the function for converting.
 * The implementation uses the analogy of the pattern Command.
 * </p>
 * @param <T> - Type of object encapsulating the data used to convert.
 */
public class ConvertingData<T> {

    /**
     * <p>
     * The object field encapsulates the implementation of the data conversion function.
     * </p>
     * @serialField 1.1
     * @since 1.0
     * @see com.lugowoy.util.converting.Converting
     * */
    private Converting<T> converting;

    /**
     * <p>
     * The constructor initializes the object with a function to perform the conversion.
     * {@link ConvertingData#converting}
     * </p>
     * @since 1.0
     * @param converting - Function that performs conversion.
     *                     The parameter will accept any class that implements the interface com.lugowoy.util.converting.Calculable;
     * @see com.lugowoy.util.converting.Convertable
     * @see com.lugowoy.util.converting.Converting
     * */
    public ConvertingData(Converting<T> converting) {
        this.converting = converting;
    }

    /**
     * <p>
     * The method of the object performs the conversion using delegation of the conversion duties to the functional interface.
     * </p>
     * @since 1.0
     * @param t - The data of this object is used for conversion.
     * @see com.lugowoy.util.converting.Converting
     * */
    public void convert(T t) {
        converting.convert(t);
    }

}
