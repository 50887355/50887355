//package com.springdc;
//
//import java.text.ParseException;
//import java.util.HashSet;
//import java.util.Locale;
//import java.util.Set;
//
//import org.springframework.format.AnnotationFormatterFactory;
//import org.springframework.format.Formatter;
//import org.springframework.format.Parser;
//import org.springframework.format.Printer;
//
//public class MaskFormatAnnotationFormatterFactory implements AnnotationFormatterFactory<MaskFormat> {
//	public Set<Class<?>> getFieldTypes() {
//		Set fieldTypes = new HashSet(1, 1.0F);
//		fieldTypes.add(String.class);
//		return fieldTypes;
//	}
//
//	public Parser<?> getParser(MaskFormat annotation, Class<?> fieldType) {
//		return new MaskFormatter(annotation.value());
//	}
//
//	public Printer<?> getPrinter(MaskFormat annotation, Class<?> fieldType) {
//		return new MaskFormatter(annotation.value());
//	}
//
//	private static class MaskFormatter implements Formatter<String> {
//		private MaskFormatter delegate;
//
//		public MaskFormatter(String mask) {
//			try {
//				this.delegate = new MaskFormatter(mask);
//				this.delegate.setValueContainsLiteralCharacters(false);
//			} catch (ParseException e) {
//				throw new IllegalStateException("Mask could not be parsed " + mask, e);
//			}
//		}
//
//		public String print(String object, Locale locale) {
//			try {
//				return this.delegate.valueToString(object);
//			} catch (ParseException e) {
//				throw new IllegalArgumentException("Unable to print using mask " + this.delegate.getMask(), e);
//			}
//		}
//
//		public String parse(String text, Locale locale) throws ParseException {
//			return (String) this.delegate.stringToValue(text);
//		}
//	}
//}