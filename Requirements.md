# MedExplain AI – Requirements Document

## 1. Project Overview
MedExplain AI is a web-based Medical Report Translator that converts complex medical reports into simple, patient-friendly explanations. Users can paste report text or upload a PDF file, and the system highlights key medical values, explains them, and indicates whether they are normal or abnormal.

---

## 2. Objectives
- Simplify medical reports for patients and families.
- Highlight important health values and their status.
- Improve healthcare literacy and doctor–patient communication.
- Provide safe explanations without diagnosis or treatment advice.

---

## 3. Functional Requirements

### 3.1 User Input
- Users can paste medical report text.
- Users can upload PDF medical reports.

### 3.2 Report Processing
- Extract text from uploaded PDF files.
- Detect key medical values using pattern matching:
  - Hemoglobin
  - Blood Glucose
  - Blood Pressure
  - Cholesterol
  - BMI

### 3.3 Analysis & Interpretation
- Compare extracted values with standard reference ranges.
- Classify results as:
  - Normal
  - High
  - Low
  - Underweight / Overweight (BMI)

### 3.4 Output Generation
- Provide simplified explanations.
- Highlight abnormal values using color indicators.
- Suggest questions users can ask their doctor.
- Include a safety disclaimer.

### 3.5 User Interface
- Simple and responsive web interface.
- Display structured results clearly.

---

## 4. Non-Functional Requirements

### Performance
- Process reports within a few seconds.
- Efficient handling of PDF extraction.

### Security & Privacy
- No permanent storage of uploaded reports.
- Secure handling of user input.

### Usability
- Easy-to-use interface for non-technical users.
- Clear and readable output.

### Scalability (Future)
- Support image uploads with OCR.
- Multi-language support.
- Cloud deployment.

---

## 5. Technology Stack

### Backend
- Python
- Flask

### Libraries
- pdfplumber (PDF text extraction)
- regex (pattern matching)

### Frontend
- HTML, CSS (embedded template)

---

## 6. Assumptions & Constraints
- Reports contain recognizable keywords and values.
- The system provides educational explanations only.
- Not intended for diagnosis or medical decision-making.

---

## 7. Future Enhancements
- AI-based medical NLP entity recognition.
- Regional language translations.
- Image OCR support.
- User history & report comparison.
- AWS cloud integration.

