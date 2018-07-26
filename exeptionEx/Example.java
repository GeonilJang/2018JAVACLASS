package exeptionEx;

/*
 * 
 * Object - > Throwable - > Error -> OutOfMemoryEorror .....  
 *                      
 *                      - > ★ Exception  -> IOException (외부에서 입력하면서 발생하는 오류)
 *                                      ->  ClassNotFoundException
 *                                      -> ....
 *                                      -> RuntimeException -> ArithmeticException
 *                                                          -> ClassCastException
 *                                                          -> NullPointExcepyiom
 *                                                          ->......
 *
 *
 *
 *에외 처리방법 
 * + 직적처리 : try~ catch (추천하며, 우선적인 방법으로 사용)
 * 
 *       try{
 *       }catch(해당예외클래스 e){
 *       }
 * 
 * 
 * + 선언처리 : throws 
 *
 *
 *
 *
 * */

public class Example {

}
