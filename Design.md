# MedExplain AI – System Design Document

## 1. System Overview
MedExplain AI is a Flask-based web application that extracts and analyzes medical data from reports and presents simplified explanations to users.

---

## 2. System Architecture

### Components
1. **Frontend Interface**
   - HTML/CSS web page
   - Allows text input and PDF upload
   - Displays results

2. **Backend Server (Flask)**
   - Handles user requests
   - Processes uploaded files
   - Runs analysis logic

3. **Report Processing Module**
   - Extracts text from PDFs using pdfplumber
   - Cleans and prepares text for analysis

4. **Medical Analysis Engine**
   - Uses regex pattern matching to identify values
   - Compares values with reference ranges
   - Classifies results

5. **Explanation Generator**
   - Creates simple explanations
   - Formats results with status indicators
   - Adds safety disclaimer and doctor questions

---

## 3. Workflow

1. User opens web application.
2. User pastes report text OR uploads PDF.
3. Server extracts text from input.
4. System identifies medical values.
5. Values compared with standard ranges.
6. Explanation and status generated.
7. Structured results displayed to user.

---

## 4. Data Flow

User Input → Flask Server → Text Extraction → Value Detection → Analysis → Explanation Generation → Result Display

---

## 5. Key Modules

### 5.1 PDF Text Extraction
**Function:** `extract_text_from_pdf(file)`
- Opens PDF
- Extracts text page-by-page
- Returns combined text

### 5.2 Report Analysis
**Function:** `analyze_report(text)`
- Searches for medical parameters
- Evaluates value ranges
- Generates formatted explanation

### 5.3 Web Route Controller
**Route:** `/`
- Handles GET and POST requests
- Accepts text or PDF input
- Returns rendered results

---

## 6. Reference Ranges Used

| Parameter | Normal Range |
|----------|-------------|
| Hemoglobin | 12 – 16 g/dL |
| Glucose | 70 – 140 mg/dL |
| Blood Pressure | 90/60 – 140/90 mmHg |
| Cholesterol | < 200 mg/dL |
| BMI | 18.5 – 25 |

---

## 7. UI Design Principles
- Clean and minimal interface
- Color-coded health indicators:
  - Green → Normal
  - Red → High
  - Orange → Low
- Structured readable output

---

## 8. Security & Privacy Design
- No report data stored permanently.
- Files processed temporarily in memory.
- Local processing ensures privacy.

---

## 9. Limitations
- Depends on correct keyword detection.
- Cannot interpret handwritten reports.
- Does not provide diagnosis.

---

## 10. Future Design Improvements
- Integrate OCR for image reports.
- Use Medical NLP models for better entity detection.
- Cloud deployment and scaling.
- Multi-language explanation engine.

